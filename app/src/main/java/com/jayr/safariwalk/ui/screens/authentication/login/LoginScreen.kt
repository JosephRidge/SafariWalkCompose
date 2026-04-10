package com.jayr.safariwalk.ui.screens.authentication.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.jayr.safariwalk.R
import com.jayr.safariwalk.ui.components.LottieAnimationWidget

@Composable
fun LoginScreen() {
    var emailInput by remember { mutableStateOf(TextFieldValue("")) }
    var passwordInput by remember { mutableStateOf(TextFieldValue("")) }
    Column {
        LottieAnimationWidget(R.raw.auth_login)
//         input email
        OutlinedTextField(
            value = emailInput,
            onValueChange = { emailInput = it },
            maxLines = 1, // makes sure that the text only occupies one line
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "Email"
                )
            },
            shape = RoundedCornerShape(24.dp),
            placeholder = { Text(text = "eg johndoe@example.com") },
            modifier = Modifier.fillMaxWidth()
        )
//         input password
        OutlinedTextField(
            value = passwordInput,
            onValueChange = { passwordInput = it },
            maxLines = 1, // makes sure that the text only occupies one line
            leadingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.password_24),
                    contentDescription = "password"
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.outline_visibility_24),
                    contentDescription = "view password"
                )
            },
            shape = RoundedCornerShape(24.dp),
            placeholder = { Text(text = "********") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

//         button
    }
}


