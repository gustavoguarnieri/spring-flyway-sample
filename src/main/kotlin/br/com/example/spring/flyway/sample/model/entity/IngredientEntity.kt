package br.com.example.spring.flyway.sample.model.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "ingredient")
class IngredientEntity : Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(nullable = false)
    var productId: Long? = null

    @Column(nullable = false)
    var ingredientName: String? = null

    var portion: String? = null
}
