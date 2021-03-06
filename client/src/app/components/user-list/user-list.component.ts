import { Component, OnInit } from '@angular/core';

import {UserService} from '../../services/user.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  users: any = []

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.getUser();
  }

  getUser(){
    this.userService.getUsers().subscribe(
      res => {
        this.users = res;
      },
      err => console.log(err)
    )
  }
  deleteUser(userId: string) {
      this.userService.deleteUsers(userId).subscribe(
        res => {
          this.users = res;
          this.getUser();
        },
        err => console.log(err)
      )
  }


}
