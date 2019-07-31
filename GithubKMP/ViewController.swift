//
//  ViewController.swift
//  GithubKMP
//
//  Created by Anas Riahi on 7/25/19.
//  Copyright © 2019 Anas Riahi. All rights reserved.
//

import UIKit
import shared

class ViewController: UIViewController, MembersView {
    
    lazy var presenter: MembersPresenter = {
        MembersPresenter(view: self, repository: AppDelegate.appDelegate.dataRepository)
    }()
    
    var isUpdating = false

    @IBOutlet weak var greetingLbl: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        greetingLbl.text = Greeting().greeting()
    }
    
    override func viewWillAppear(_ animated: Bool) {
        presenter.onCreate()
    }

    override func viewWillDisappear(_ animated: Bool) {
        presenter.onDestroy()
    }
    
    func onUpdate(members: String) {
        print(members)
    }

}

