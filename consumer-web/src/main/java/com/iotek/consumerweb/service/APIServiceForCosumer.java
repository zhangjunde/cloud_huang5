package com.iotek.consumerweb.service;

import com.iotek.apiservice.APIService.APIService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="cloud-provider")
public interface APIServiceForCosumer extends APIService {

}
