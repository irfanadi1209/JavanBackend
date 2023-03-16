package com.javanbackend.laporanpajak.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LaporanBody {
    private String nomorResi;
    private Integer statusId;
    private Long userId;
}
