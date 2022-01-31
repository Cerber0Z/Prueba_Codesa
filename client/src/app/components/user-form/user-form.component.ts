import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/models/User';
import {Router , ActivatedRoute} from '@angular/router';

import {UserService} from '../../services/user.service'

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  user: Usuario = {
    activo: '',
    nombre: '',
    rol_id: 0
  }

  constructor(private userService: UserService, private router: Router, private activatedRoute: ActivatedRoute) { }

  ngOnInit(){
    const params = this.activatedRoute.snapshot.params;
    if(params['id']){
      this.userService.getUsersbyid(params['id']).subscribe((res:any)=>{
        console.log(res)
        this.user = res
      })
    }
  }


  saveNewUser(){
      this.userService.saveUser(this.user).subscribe(
        res => {
          console.log(res);
          this.router.navigate(['/usuarios']);
        },
        err => console.error(err)
      )
  }

}
