//
//  AppDelegate.swift
//  GithubKMP
//
//  Created by Anas Riahi on 7/25/19.
//  Copyright © 2019 Anas Riahi. All rights reserved.
//

import UIKit
import shared

@UIApplicationMain
class AppDelegate: UIResponder, UIApplicationDelegate {
    
    public lazy var dataRepository = {MembersDataRepository(api: GithubApi()) }()

    var window: UIWindow?

    static var appDelegate: AppDelegate {
        return UIApplication.shared.delegate as! AppDelegate
    }


}

