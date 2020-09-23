package com.springcloud.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class PageInfo {
    private long total;
    private long pageSize;
    private long pageNum;
}
