package com.company.temp.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaleVO {
	public String sale_seq;
	public String sale_date;
	public String product_id;
	public String sale_qty;
	public String sale_price;
	public String member_id;

	
}
