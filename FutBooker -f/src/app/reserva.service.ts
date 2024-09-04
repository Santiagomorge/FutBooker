import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Reserva {
  cancha: number;
  fecha: string;
  nombre: string;
  hora: number;
}

@Injectable({
  providedIn: 'root'
})


export class ReservaService {

  private apiUrl = 'http://localhost:8080/reservar';
  constructor(private http: HttpClient) { }

  crearReserva(reserva: Reserva): Observable<Reserva> {
    return this.http.post<Reserva>(this.apiUrl, reserva)
  }
}
