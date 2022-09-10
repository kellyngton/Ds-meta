package com.kellyngton.dsmeta.Sale;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping(value = "/sales")
@RequiredArgsConstructor
public class SaleController {
    private final SaleService saleService;
    private final SaleSmsService smsService;

    @GetMapping
    public Page<SaleModel> findSales(
            @RequestParam(value = "minDate", defaultValue = "") String minDate,
            @RequestParam(value = "minDate", defaultValue = "") String maxDate,
            Pageable pageable){
        return saleService.findSales(minDate, maxDate, pageable);
    }

    @GetMapping("/{id}/notification")
    public void nofifySms(@PathVariable Long id){
        smsService.sendSms(id);
    }
}
