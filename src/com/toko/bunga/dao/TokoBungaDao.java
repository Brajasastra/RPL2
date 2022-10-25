package com.toko.bunga.dao;

import com.toko.bunga.model.Tokobunga;
import java.util.List;
/**
 *
 * @author USER
 */
public interface TokoBungaDao {
    public void save(Tokobunga tokobunga);
    public void update(Tokobunga tokobunga);
    public void delete(Tokobunga tokobunga);
    public Tokobunga get(String kd_bunga);
    public List<Tokobunga> getList();
}
