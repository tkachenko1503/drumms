(ns drumms.runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [drumms.core-test]))

(doo-tests 'drumms.core-test)
