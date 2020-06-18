package demo.avoid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/articleInstant")
    public String getArticle() {
        return articleService.getArticle();
    }

    @GetMapping("/articleAfter30s")
    public String getArticleAfter30s() {
        return articleService.getArticleWithDelay();
    }
}
