(ns drumms.components.drumm-kit)


(defn drumm-kit
  "Main canvas for drumms"
  [& children]
  (into
    [:svg {:view-box "0 0 10 6"
           :overflow "visible"}]
    children))


