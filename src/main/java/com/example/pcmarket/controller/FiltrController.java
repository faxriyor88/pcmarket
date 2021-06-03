package com.example.pcmarket.controller;

import com.example.pcmarket.entity.Product;
import com.example.pcmarket.service.FiltService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/filtr")
public class FiltrController {
    @Autowired
    FiltService filtService;

    @GetMapping("/price")
    public ResponseEntity<List<Product>> filtrPrice(@RequestParam Integer id1, @RequestParam Integer id2) {
        return ResponseEntity.ok(filtService.filtrPcPrice(id1, id2));
    }

    @GetMapping("/name")
    public ResponseEntity<List<Product>> filtrName(@RequestParam String name) {
        return ResponseEntity.ok(filtService.filtrPcName(name));
    }

    @GetMapping("/info")
    public ResponseEntity<List<Product>> filtrInfo(@RequestParam String info) {
        return ResponseEntity.ok(filtService.filtrPcInfo(info));
    }

    @GetMapping("/infoprice")
    public ResponseEntity<List<Product>> filtrPriceInfo(@RequestParam String info, @RequestParam Integer id1, @RequestParam Integer id2) {
        return ResponseEntity.ok(filtService.filtrPcInfoPrice(info, id1, id2));
    }

    @GetMapping("/nameprice")
    public ResponseEntity<List<Product>> filtrPriceName(@RequestParam String name, @RequestParam Integer id1, @RequestParam Integer id2) {
        return ResponseEntity.ok(filtService.filtrPcNamePrice(name, id1, id2));
    }

    @GetMapping("/infoname")
    public ResponseEntity<List<Product>> filtrInfoName(@RequestParam String info, @RequestParam String name) {
        return ResponseEntity.ok(filtService.filtrPcNameInfo(name, info));
    }

    @GetMapping("/infonameprice")
    public ResponseEntity<List<Product>> filtrPriceInfoName(@RequestParam String info, @RequestParam String name, @RequestParam Integer id1, @RequestParam Integer id2) {
        return ResponseEntity.ok(filtService.filtrPcNameInfoPrice(info, name, id1, id2));
    }

    // ============= Xarakteristkalar orqali qidirish ===============
    @GetMapping("/charac")
    public ResponseEntity<List<Product>> filtrCharac(@RequestParam List<String> name) {
        String names = "";
        for (String n : name) {
            names = names + "'" + n + "',";
        }
        names = names.substring(0, names.length() - 1);
        return ResponseEntity.ok(filtService.getProductByCharak(names));
    }

}
