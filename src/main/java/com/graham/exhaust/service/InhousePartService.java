package com.graham.exhaust.service;

import com.graham.exhaust.domain.InhousePart;

import java.util.List;

/**
 *
 *
 *
 *
 */
public interface InhousePartService {
    public List<InhousePart> findAll();
    public InhousePart findById(int theId);
    public void save (InhousePart thePart);
    public void deleteById(int theId);
}
