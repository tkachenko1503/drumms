(ns drumms.components.hi-hat
  (:require [drumms.components.drumm :refer [drumm]]))


(defn hi-hat
  "Hi hat cymbal"
  [{:keys [x y]}]
  [drumm {:size  1
          :sound :hi-hat
          :type  :cymbal
          :name  "Hi-hat"
          :x     x
          :y     y}])
