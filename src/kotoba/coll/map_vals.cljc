(ns kotoba.coll.map-vals
  "map-vals -- one definition, addressed on its own.

  Split out of kotoba.lang.text on 2026-09-09. The unit here is the
  DEFINITION, not the library: this repo holds map-vals and names, in its
  deps.edn, exactly the definitions map-vals reaches. Nothing else."
  )

(defn map-vals
  "Return a map with the same keys as `m` and `f` applied to each value.
  Preserves the key's identity (objects/keywords/strings)."
  [f m]
  (reduce-kv (fn [out k v] (assoc out k (f v))) {} m))
