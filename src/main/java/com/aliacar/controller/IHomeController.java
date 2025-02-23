package com.aliacar.controller;

import com.aliacar.dto.DtoHome;

public interface IHomeController {

    public DtoHome findHomeById(Long id);
}
