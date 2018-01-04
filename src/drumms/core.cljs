(ns drumms.core
  (:require [reagent.core :as reagent]
            [re-frame.core :as re-frame]
            [drumms.events :as events]
            [drumms.routes :as routes]
            [drumms.config :as config]
            [drumms.components.app :refer [app]]))


(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [app]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (routes/app-routes)
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
