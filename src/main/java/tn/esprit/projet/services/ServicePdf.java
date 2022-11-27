package tn.esprit.projet.services;

import tn.esprit.projet.entities.Departement;

import java.io.ByteArrayInputStream;
import java.util.List;


public interface ServicePdf {
    ByteArrayInputStream exportPDF(List<Departement> departements);
}
