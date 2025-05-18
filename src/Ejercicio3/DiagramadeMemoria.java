/*
┌────────────────────────────────────│
│          Stack              │
├────────────────────────────────────│
│ v: referencia a objeto Coche│ ← parámetro del método gestionarVehiculo()
│ c: referencia a objeto Coche│ ← creada al hacer downcasting
└───────────────────────────────────── 

┌───────────────────────────────────────────────────────────────────────
│                          Heap (Objeto)                 │
├───────────────────────────────────────────────────────────────────────
│ Tipo real: Coche                                       │
│---------------------------------------------------------
│ Métodos disponibles       (sobrescritos)               │     │
│ + encender()              "Coche encendido"            │
│ + apagar()                "Coche apagado"              │
│ + abrirMaletero()         "Abriendo maletero del coche"│
└──────────────────────────────────────────────────────────────────────┘

*/