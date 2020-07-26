class Account:
    id          =    int 
    name        =    str 
    document    =    str
    email       =    str
    password    =    str  

    # similar a this
    # Métodos Mágicos, estos métodos son llamados automáticamente y estrictamente bajo ciertas reglas
    # __init__ se encargará de personalizar la instanciación de la clase o inicializar atributos del objeto creado
    # __new__ construye el objeto
    def __init__(self, name, document): # constructor
        self.name  =  name
        self.document  =  document

        