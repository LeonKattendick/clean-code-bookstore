# clean-code-bookstore
Gruppe: Franz Schillinger, Benedikt Allerberger, Leon Kattendick

## Design Patterns
* **Builder Pattern**: Book, Report, Customer & Order Klassen
* **Singleton Pattern**: Management Klassen
* **Abstract Factory Pattern**: Reports
* **Strategy Pattern**: Order Handling
* **Composite Pattern**: Customers

### Builder Pattern
Model Klassen können erweitert werden, ohne das alle Implementierungen brechen.
Nur notwendiger Attribute können übergeben werden, ohne das ein neuer Konstruktor angelegt werden muss.

### Singleton Pattern
Die Management-Klassen sollten im System nur einmal erzeugt werden.
Über das Singleton Pattern wird diese eine Instanz lazy beim ersten Aufruf erstellt.

### Abstract Factory Pattern
Unterschiedliche Reports werden über die jeweilige Factory angelegt.
Jeder Report kann dabei mit seinen benötigten Attributen befüllt werden.
Anschließend können die erstellten Reports aber abstrakt per Schleife verarbeitet werden, ohne das auf die abgeleitete Klasse geachtet werden muss.

### Strategy Pattern
Bestellungen werden je nach Typ anders abgefertigt. 
Falls neue Bestellungsarten hinzukommen, kann die Verarbeitung dieser durch das Hinzufügen einer neuen Strategie behandelt werden.
Dabei muss der Code der bereits existierenden Bestellungsarten nicht verändert werden.

### Composite Pattern
Es gibt einen Baum von unterschiedlichen Kundentypen. 
Die Bestellungen werden je Kunde gleich angelegt.
Je nach Art des Kunden werden daraufhin die Attribute der Bestellung ggf. abgeändert.