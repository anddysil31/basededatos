package com.example.invoiceas.controller

import com.example.invoiceas.model.Client
import com.example.invoiceas.service.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.xml.ws.Service

@RestController
@RequestMapping("/client")
class ClientController {

    @Autowired
    lateinit var clientService: ClientService

    @GetMapping
    fun list():List<Client>{
        return clientService.list()
    }

    @PostMapping
    fun save(@RequestBody client: Client): Client?{
        return clientService.save(client)

    }

}
