import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Usuario } from '../models/User'

@Injectable({
  providedIn: 'root'
})
export class UserService {

  API_URL = 'http://localhost:8080/users';

  constructor(private http: HttpClient) { }

  getUsers(){
    return this.http.get(`${this.API_URL}/listalluser`);
  }

  getUsersbyid(id:string){
    return this.http.get(`${this.API_URL}/getuser/${id}`);
  }


  deleteUsers(id:string){
    return this.http.delete(`${this.API_URL}/deleteuser/${id}`);
  }

  saveUser(user: Usuario){
    console.log('Esta es la data ' + user.nombre)
    return this.http.post(`${this.API_URL}/savedata` ,user);
  }

  updateUser(userUpdate: Usuario){
    return this.http.put(`${this.API_URL}/updateuser` ,userUpdate);
  }

}
