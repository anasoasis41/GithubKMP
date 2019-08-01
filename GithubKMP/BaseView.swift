//
//  BaseView.swift
//  GithubKMP
//
//  Created by Anas Riahi on 7/31/19.
//  Copyright © 2019 Anas Riahi. All rights reserved.
//

import Foundation
import shared
import UIKit

extension UIViewController: BaseView {
    
    public func showError(error: KotlinThrowable) {
        let title: String = "Error"
        var errorMessage: String? = nil
        
        switch error {
        case is UpdateProblem:
            errorMessage = "Failed to get data from server, please check your internet connection"
        default:
            errorMessage = "Unknown error"
        }
        
        if let message = errorMessage {
            self.showError(title: title, message: message)
        }
    }
    
    func showError(title: String, message: String) {
        let alerController = UIAlertController(title: title, message: message, preferredStyle: UIAlertController.Style.alert)
        alerController.addAction(UIAlertAction(title: "Dismiss", style: UIAlertAction.Style.default, handler: nil))
        self.present(alerController, animated: true, completion: nil)
    }
}
