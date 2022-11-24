package github.marchocode.hesuanjiancedian.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import github.marchocode.hesuanjiancedian.domain.PositionItem;

public interface PositionItemRepository extends MongoRepository<PositionItem, String> {

}
