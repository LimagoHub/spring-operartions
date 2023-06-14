package de.limago.wepapp17;

import jakarta.validation.constraints.Size;
import java.util.UUID;



public record PersonDTO ( UUID id, @Size(min = 2, max =10) String vorname, String nachname) {}
