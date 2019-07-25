//
//  ViewController.swift
//  GithubKMP
//
//  Created by Anas Riahi on 7/25/19.
//  Copyright © 2019 Anas Riahi. All rights reserved.
//

import UIKit
import shared

class ViewController: UIViewController {

    @IBOutlet weak var greetingLbl: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        greetingLbl.text = Greeting().greeting()
    }


}

