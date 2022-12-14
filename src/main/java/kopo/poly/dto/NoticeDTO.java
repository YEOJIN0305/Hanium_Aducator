package kopo.poly.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeDTO {
    private String notice_seq;
    private String notice_yn;
    private String user_seq;
    private String user_name;
    private String notice_date;
    private String update_id;
    private String title;
    private String contents;
    private String update_date;
}
