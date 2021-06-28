package com.ame.peliculasticotv.common

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.widget.Toast
import com.ame.peliculasticotv.R


class Helpers {

    companion object {

        fun ShowMessage(context: Context, title: String?, msg: String?) {
            val dialogo = AlertDialog.Builder(context)
            dialogo.setTitle(title)
            dialogo.setMessage(msg)
            dialogo.setCancelable(true)
            dialogo.setPositiveButton(
                context.getString(R.string.cerrar)
            ) { dialogo, id -> dialogo.dismiss() }
            dialogo.show()
        }

        fun toastLong(message: String, context: Context) {

            Toast.makeText(context, message, Toast.LENGTH_LONG).show()

        }

        fun toastShort(message: String, context: Context) {

            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

        }

        fun alertDialog(message: String, title: String, context: Context) {

            val alertDialog: AlertDialog? = context?.let {
                val builder = AlertDialog.Builder(it)
                builder.setTitle(title)
                builder.setMessage(message)
                builder.apply {
                    setPositiveButton(R.string.aceptar,
                        DialogInterface.OnClickListener { dialog, id ->

                            dialog.dismiss()
                        })
                    setNegativeButton(R.string.cancelar,
                        DialogInterface.OnClickListener { dialog, id ->

                            dialog.dismiss()
                        })
                }
                // Set other dialog properties

                // Create the AlertDialog
                builder.create()
            }

        }

        fun alertDialogAceptar(message: String, title: String, context: Context) {

            val alertDialog: AlertDialog? = context?.let {
                val builder = AlertDialog.Builder(it)
                builder.setTitle(title)
                builder.setMessage(message)
                builder.apply {
                    setPositiveButton(R.string.aceptar,
                        DialogInterface.OnClickListener { dialog, id ->

                            dialog.dismiss()
                        })

                }
                // Set other dialog properties

                // Create the AlertDialog
                builder.create()
            }

        }

    }
}