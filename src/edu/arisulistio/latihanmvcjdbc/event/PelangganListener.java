/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.arisulistio.latihanmvcjdbc.event;

import edu.arisulistio.latihanmvcjdbc.entity.Pelanggan;
import edu.arisulistio.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Ari Sulistio
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);
    
}
