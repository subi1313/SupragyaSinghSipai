enum Flavor {
  dev,
  staging,
  prod,
}

class F {
  static late final Flavor appFlavor;

  static String get name => appFlavor.name;

  static String get title {
    switch (appFlavor) {
      case Flavor.dev:
        return 'MyApp-Dev';
      case Flavor.staging:
        return 'MyApp-Staging';
      case Flavor.prod:
        return 'MyApp-Prod';
    }
  }

}
