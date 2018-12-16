package net.kyori.ana;

import org.junit.jupiter.api.Test;

import static net.kyori.ana.Articles.get;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArticlesTest {
  @Test
  void testGet() {
    assertEquals("an", get("action"));
    assertEquals("an", get("amusement"));
    assertEquals("an", get("article"));
    assertEquals("a", get("carrot"));
    assertEquals("a", get("cat"));
    assertEquals("an", get("honorary"));
    assertEquals("an", get("ordinary"));
    assertEquals("an", get("orthopedic"));
    assertEquals("a", get("potato"));
    assertEquals("an", get("unknown"));
    assertEquals("an", get("unusual"));
    assertEquals("a", get("zombie"));
  }
}
