package github.marchocode.hesuanjiancedian.domain;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("chengdu")
public class PositionItem {

    @Id
    private String id;

    private String name;

    private String address;

    private String time;

    private String area;

    private String status;

    private String longitude;

    private String latitude;
}
