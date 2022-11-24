package github.marchocode.hesuanjiancedian.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import github.marchocode.hesuanjiancedian.domain.PositionItem;
import github.marchocode.hesuanjiancedian.repository.PositionItemRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/postion")
@RequiredArgsConstructor
public class PostionItemController {

    private final PositionItemRepository positionItemRepository;

    @GetMapping
    public ResponseEntity<Object> list() {
        List<PositionItem> findAll = positionItemRepository.findAll();
        return ResponseEntity.ok(findAll);
    }

}
