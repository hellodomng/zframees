/**
 * Copyright (c) 2015 https://github.com/zhaohuatai
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.zht.common.rabc.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zht.common.rabc.service.IRbacModuleService;
@Service
@Transactional(rollbackFor=Exception.class)
public class RbacModuleServiceImpl implements IRbacModuleService{}
