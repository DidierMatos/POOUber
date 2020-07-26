from car import Car
from account import Account

# Método principal de python
# La notación de python se rige mediante tabs o espacios
if __name__ == "__main__":
    print("Hola Mundo")

    car = Car("AMS235", Account("Andres Herrera", "ANDA876")) # Instancia del objeto
    # car.license = "AMS234"
    # car.driver = "Andres Herrera"
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("QWE567", Account("Martha", "MAJK765"))
    # car2.license = "QWE567"
    # car2.driver = "Martha"
    print(vars(car2))
    print(vars(car2.driver))