/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Date;

/**
 *
 * @author casper
 */
public class KisiYakinlar {
    
    private Integer yakinlar_id;
    private Integer muracaat_id;
    private Integer kisi_id;
    private Integer ozel_statu_id;
    private Date olum_tarihi;
    private Date kayit_tarihi;
    private Date guncelleme_tarihi;

    public KisiYakinlar(Integer yakinlar_id, Integer muracaat_id, Integer kisi_id, Integer ozel_statu_id, Date olum_tarihi, Date kayit_tarihi, Date guncelleme_tarihi) {
        this.yakinlar_id = yakinlar_id;
        this.muracaat_id = muracaat_id;
        this.kisi_id = kisi_id;
        this.ozel_statu_id = ozel_statu_id;
        this.olum_tarihi = olum_tarihi;
        this.kayit_tarihi = kayit_tarihi;
        this.guncelleme_tarihi = guncelleme_tarihi;
    }

    public KisiYakinlar(Integer muracaat_id, Integer kisi_id, Integer ozel_statu_id, Date olum_tarihi) {
        this.muracaat_id = muracaat_id;
        this.kisi_id = kisi_id;
        this.ozel_statu_id = ozel_statu_id;
        this.olum_tarihi = olum_tarihi;
    }

    public KisiYakinlar(Integer muracaat_id, Integer kisi_id, Integer ozel_statu_id) {
        this.muracaat_id = muracaat_id;
        this.kisi_id = kisi_id;
        this.ozel_statu_id = ozel_statu_id;
    }
    
 
     public KisiYakinlar () {      
    }

    public Integer getYakinlar_id() {
        return yakinlar_id;
    }

    public void setYakinlar_id(Integer yakinlar_id) {
        this.yakinlar_id = yakinlar_id;
    }

    public Integer getMuracaat_id() {
        return muracaat_id;
    }

    public void setMuracaat_id(Integer muracaat_id) {
        this.muracaat_id = muracaat_id;
    }

    public Integer getKisi_id() {
        return kisi_id;
    }

    public void setKisi_id(Integer kisi_id) {
        this.kisi_id = kisi_id;
    }

    public Integer getOzel_statu_id() {
        return ozel_statu_id;
    }

    public void setOzel_statu_id(Integer ozel_statu_id) {
        this.ozel_statu_id = ozel_statu_id;
    }

    public Date getOlum_tarihi() {
        return olum_tarihi;
    }

    public void setOlum_tarihi(Date olum_tarihi) {
        this.olum_tarihi = olum_tarihi;
    }

    public Date getKayit_tarihi() {
        return kayit_tarihi;
    }

    public void setKayit_tarihi(Date kayit_tarihi) {
        this.kayit_tarihi = kayit_tarihi;
    }

    public Date getGuncelleme_tarihi() {
        return guncelleme_tarihi;
    }

    public void setGuncelleme_tarihi(Date guncelleme_tarihi) {
        this.guncelleme_tarihi = guncelleme_tarihi;
    }
    
}
