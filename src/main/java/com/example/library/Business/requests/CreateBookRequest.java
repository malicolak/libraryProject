package com.example.library.Business.requests;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBookRequest {

    @NotNull(message = "Kitap adı boş olamaz!")
    @Size(min = 3,max = 100,message = "Kitap adı 3 ile 100 karakter arası olmalıdır!")
    @NotBlank(message = "Kitap adı boş olamaz!")
    private String title;

    @NotNull(message = "Yazar bilgisi boş olamaz!")
    private String author;

    @NotNull(message = "Yayıncı bilgisi boş olamaz!")
    private String publisher;

    @NotNull(message = "Kitap sayfa sayısı boş olamaz!")
    @Min(value = 1, message = "Sayfa sayısı sıfırdan büyük olmalıdır!")
    @Max(value = Short.MAX_VALUE, message = "Sayfa sayısı en fazla "+Short.MAX_VALUE+" olabilir!")
    private short pageCount;

    @NotNull(message = "Yayınlanma tarihi boş olamaz!")
    @Past(message = "Yayınlanma tarihi bugün veya geçmiş bir tarih olmalıdır!")
    private LocalDate publishDate;
}
