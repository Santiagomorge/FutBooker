import { Component } from '@angular/core';
import { ReservaService, Reserva } from '../reserva.service';
import { FormsModule } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-crear-reserva',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './crear-reserva.component.html',
  styleUrl: './crear-reserva.component.css'
})

export class CrearReservaComponent {
  reserva = {
    cancha: '',
    fecha: '',
    nombre: '',
    hora: ''
  };

  reservas: any[]=[]; 
  constructor(private http: HttpClient) {}


  reservaId: number | null = null; 
  reservaEncontrada: any = null;

  ngOnInit(){
    this.loadReservas();
  }

  handleSubmit(event: Event) {
    event.preventDefault();
    
    if (this.isReservaValid()) {
      this.http.post('http://localhost:8080/reservar', this.reserva)
        .subscribe(
          response => {
            console.log('Reserva creada:', response);
          },
          error => {
            console.error('Error al crear reserva:', error);
          }
        );
    }
  }
  
  public isReservaValid(): boolean {
    return this.reserva != null &&
         //this.reserva.cancha != null && this.reserva.cancha.trim() !== '' &&
         this.reserva.nombre != null && this.reserva.nombre.trim() !== '' &&
         this.reserva.fecha != null && this.reserva.fecha.trim() !== '' ;
         //this.reserva.hora != null && this.reserva.hora.trim() !== '';

  }

  loadReservas(){
    this.http.get<any[]>('http://localhost:8080/reservas/mirar')
      .subscribe(
        data => this.reservas = data,
        error => console.error('Error al cargar reservas:', error)
      );
  }

  buscarReservaPorId() {
    if (this.reservaId !== null) {
      this.http.get(`http://localhost:8080/reservas/${this.reservaId}`)
        .subscribe(
          (response: any) => {
            this.reservaEncontrada = response;
            console.log('Reserva encontrada:', this.reservaEncontrada);

          },
          error => console.error('Error al buscar reserva:', error)
        );
    } else {
      console.error('ID de reserva no puede ser nulo.');
    }
  }
}

