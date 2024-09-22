import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import {CrearReservaComponent} from './crear-reserva/crear-reserva.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CrearReservaComponent, FooterComponent, HeaderComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'FutBooker';
}
