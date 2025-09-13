package com.ohgiraffers.section01.object;

public class Book extends Object{
    private int number;
    private String title;
    private String author;
    private int price;

    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        /*  */
        if(this == obj) {
            return true;
        }
        /* this는 인스턴스가 생성되면 주소값이 저장된다. null일 수 없다.
         * 따라서 전달받은 레퍼런스변수에 null값이 저장되어 있다면
         * 비교하려는 두 개의 인스턴스는 서로 다른 인스턴스이다.
         * */
        if(obj == null) {
            return false;
        }

        /* 전달받은 레퍼런스 변수를 Book 타입으로 형변환하여 각 필드별로 비교를 시작한다. */
        Book other = (Book) obj;

        /* number 필드의 값이 서로 같지 않은 경우 서로 다른 인스턴스이다. */
        if(this.number != other.number) {
            return false;
        }

        /* title 필드의 값이 null인 경우
         * 매개변수로 전달받은 인스턴스의 title 필드에도 null이 저장되어 있어야 서로 같은 값을 가진다.
         * 그렇지 않은 경우 false를 리턴하고 종료함
         * */
        if(this.title == null) {

            /* title 필드가 null인 경우 다른 인스턴스의 title이 null이 아니면 false 반환 */
            if(other.title != null) {
                return false;
            }

        } else if(!this.title.equals(other.title)) {

            /* String 클래스의 equals()는 이미 해당 기능을 오버라이딩 해 두었기 때문에
             * 같은 값을 가지는지 비교를 한다.
             * */

            /* title필드가 null이 아닌 경우
             * 두 인스턴스의 title 필드값이 같아야 한다.
             * 그렇지 않은 경우 false 반환 */
            return false;
        }

        /* 작가의 경우도 마찬가지로 비교한다. */
        if(this.author == null) {

            if(other.author != null) {
                return false;
            }

        } else if(!this.author.equals(other.author)) {

            return false;
        }

        /* price 필드가 서로 다른 값을 가지면 false 반환 */
        if(this.price != other.price) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}


