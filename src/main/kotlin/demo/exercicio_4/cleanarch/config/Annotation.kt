package demo.exercicio_4.cleanarch.config

class Annotation {
    annotation class PrimaryKey
    annotation class Relation(val parentColumn: String, val entityColumn: String)
}