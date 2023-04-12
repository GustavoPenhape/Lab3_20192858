package com.laboratorio.lab3_20192858.controller;

import com.laboratorio.lab3_20192858.entity.Hospitales;
import com.laboratorio.lab3_20192858.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/Hospitales")
public class Hospitales_controller {

    final HospitalRepository hospitalRepository;
    public Hospitales_controller(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @GetMapping(value = {"/list","/"})
    public String listarHospitales(Model model) {

        List<Hospitales> lista = hospitalRepository.findAll();
        model.addAttribute("Hospitales_lista", lista);

        return "Hospitales/list";
    }

//    @GetMapping("/new")
//    public String nuevoTransportistaFrm() {
//        return "shipper/newFrm";
//    }

//    @PostMapping("/save")
//    public String guardarNuevoTransportista(Shipper shipper) {
//        shipperRepository.save(shipper);
//        return "redirect:/shipper/list";
//    }
//
//    @GetMapping("/edit")
//    public String editarTransportista(Model model,
//                                      @RequestParam("id") int id) {
//
//        Optional<Shipper> optShipper = shipperRepository.findById(id);
//
//        if (optShipper.isPresent()) {
//            Shipper shipper = optShipper.get();
//            model.addAttribute("shipper", shipper);
//            return "shipper/editFrm";
//        } else {
//            return "redirect:/shipper/list";
//        }
//    }
//
//    @GetMapping("/delete")
//    public String borrarTransportista(Model model,
//                                      @RequestParam("id") int id) {
//
//        Optional<Shipper> optShipper = shipperRepository.findById(id);
//
//        if (optShipper.isPresent()) {
//            shipperRepository.deleteById(id);
//        }
//        return "redirect:/shipper/list";
//
//    }
//
//    @PostMapping("/buscar")
//    public String buscarTransportistaPorNombre(@RequestParam("textoBuscar") String textoBuscar,
//                                               Model model) {
//
//        //List<Shipper> lista = shipperRepository.findByCompanyNameOrPhone(textoBuscar, textoBuscar);
//        List<Shipper> lista = shipperRepository.buscarParcialPorNombre(textoBuscar);
//        model.addAttribute("shipperList", lista);
//        model.addAttribute("textoBuscado", textoBuscar);
//
//        return "shipper/list";
//    }


}

