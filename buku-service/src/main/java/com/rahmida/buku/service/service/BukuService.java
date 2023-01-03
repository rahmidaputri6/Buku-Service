/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rahmida.buku.service.service;

import com.rahmida.buku.service.entity.Buku;
import com.rahmida.buku.service.repository.BukuRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author asus
 */
@Service
public class BukuService {
    private BukuRepository bukuRepository;
    
    public Buku saveBuku(Buku buku){
        return bukuRepository.save(buku);
    }
    
    public Buku findBukuById(Long bukuId){
        return (Buku) bukuRepository.findByBukuId(bukuId);
    }
}
