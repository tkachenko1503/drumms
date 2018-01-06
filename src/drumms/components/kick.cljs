(ns drumms.components.kick
  (:require [drumms.components.drumm :refer [drumm]]))


(defn kick
  "Kick drumm"
  [{:keys [x y]}]
  [drumm {:size  1.6
          :sound :kick
          :type  :drumm
          :name  "Kick"
          :x     x
          :y     y}])
