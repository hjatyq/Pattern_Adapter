# Pattern Adapter – Exemple Java (VGA / HDMI)

## 📌 Description
Ce projet illustre une implémentation claire et pédagogique du **Pattern Adapter** en Java.  
Il simule un scénario réel où une **unité centrale (UniteCentre)** communique avec différents dispositifs d’affichage utilisant des **interfaces incompatibles** (VGA et HDMI).

Le **Pattern Adapter** est utilisé pour permettre à une unité centrale qui ne comprend que le **VGA** de fonctionner avec des périphériques **HDMI** (TV, Vidéo-projecteur), sans modifier leur code source.

---

## 🎯 Objectif pédagogique
- Comprendre le **Pattern Adapter**
- Appliquer la **composition**
- Résoudre un problème d’incompatibilité d’interfaces
- Éviter la modification des classes existantes
- Respecter les principes SOLID (Open/Closed)

---

## 🧠 Principe du Pattern Adapter
> Le Pattern Adapter permet de **convertir l’interface d’une classe existante en une interface attendue par le client**.

Dans ce projet :
- L’unité centrale attend une interface **VGA**
- Certains périphériques utilisent **HDMI**
- Un **adaptateur HDMI → VGA** est utilisé comme intermédiaire

---

## 📦 Structure du projet

    src/main/java/net/hajar/pattern_adapter
    │
    ├── adapter
    │ └── HdmiVgaAdapter.java
    │
    ├── computer
    │ ├── Vga.java
    │ ├── HDMI.java
    │ ├── Ecran.java
    │ ├── TV.java
    │ ├── VideoProjecteur.java
    │ └── UniteCentre.java
    │
    ├── PatternAdapterApplication.java
    └── Test.java