package com.example.criteria3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.criteria3.model.FieldInfo;
import com.example.criteria3.repository.InputRepository;



@Service
public class InputService {
	private final InputRepository inputRepository;

    public InputService(InputRepository inputRepository) {
        this.inputRepository = inputRepository;
    }

    public Iterable<FieldInfo> list() {
        return inputRepository.findAll();
    }

    public Iterable<FieldInfo> save(List<FieldInfo> fieldinfo) {
        return inputRepository.saveAll(fieldinfo);
    }
}
