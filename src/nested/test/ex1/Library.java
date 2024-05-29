package nested.test.ex1;

public class Library {
    private int size;
    private Book[] books;
    private int cnt;
    public Library(int maxBook) {
        this.size = maxBook;
        this.books = new Book[maxBook];
        this.cnt = 0;
    }


    public void addBook(String title, String author) {
        // 검증 로직을 다 처리하고 (조기 리턴!!!!!!!!!!)
        if (cnt >= size) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        // 정상 로직을 처리
        books[cnt] = new Book(title, author);
        cnt++;
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < cnt; i++) {
            System.out.println("도서 목록: " + books[i].title +", 저자: " + books[i].author);
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
