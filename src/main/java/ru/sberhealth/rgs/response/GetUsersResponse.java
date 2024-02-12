package ru.sberhealth.rgs.response;

import lombok.Data;

import java.util.List;

@Data
public class GetUsersResponse {

    private Integer page;
    private Integer per_page;
    private Integer total;
    private Integer total_pages;
    private List<User> data;
    private Support support;
}
