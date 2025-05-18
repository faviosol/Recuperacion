/*

┌────────────────────────────────
│           Stack           │
├────────────────────────────────
│ libro     → obj libro     │
│ revista   → obj revista   │
│ dvd       → obj dvd       │
│ registro  → obj registro  │
└────────────────────────────────

┌──────────────────────────────────────────
│              Heap (objetos)       │
├──────────────────────────────────────────
│ Objeto tipo:libro                 │
│ - titulo:"1984"                   │
│ - autor:"George Orwell"           │
│ - prestado:true/false             │
│ - interfaz:Prestamo               │
├──────────────────────────────────────────
│ Objeto tipo:revista               │
│ - titulo:"National Geographic"    │
│ - autor:"varios"                  │
│ - interfaz:Prestado               │
├──────────────────────────────────────────
│ Objeto tipo:DVD                   │
│ - titulo:"Matrix"                 │
│ - autor:"Keanu Reves"             │
│ - interfaz:Prestado               │
├──────────────────────────────────────────
│ Objeto tipo:RegistroPrestamo      │
│ -historial:List<Libro,Revista,DVD>│
└──────────────────────────────────────────

 */